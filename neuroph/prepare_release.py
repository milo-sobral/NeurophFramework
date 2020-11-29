import argparse
from pathlib import Path
import os
import shutil


parser = argparse.ArgumentParser(description='Prepare a shippable package containing a release of Neuroph Framework')
parser.add_argument('dir', help='name of directory where release files will be generated')

args = parser.parse_args()

# Check if provided path is valid
release_folder = Path(args.dir)
if release_folder.is_file():
    print("File already exists with the same name")
    exit()
if release_folder.is_dir() and any(release_folder.iterdir()) :
    print("Directory specified already exists and is not empty")
    exit()

release_folder.mkdir(exist_ok=True)

os.system('/bin/bash -c "mvn release:clean release:prepare"')
os.system('/bin/bash -c "mvn release:perform"')
os.system('/bin/bash -c "mvn clean package"')
os.system('/bin/bash -c "mvn javadoc:jar"')
os.system('/bin/bash -c "mvn javadoc:aggregate"')
os.system('/bin/bash -c "mvn dependency:copy-dependencies"')

srcdir = "./Core/target"
for basename in os.listdir(srcdir):
    if basename.endswith('.jar'):
        pathname = os.path.join(srcdir, basename)
        if os.path.isfile(pathname):
            shutil.copy2(pathname, release_folder)

srcdir = "./Contrib/target"
for basename in os.listdir(srcdir):
    if basename.endswith('.jar'):
        pathname = os.path.join(srcdir, basename)
        if os.path.isfile(pathname):
            shutil.copy2(pathname, release_folder)

srcdir = "./ImageRec/target"
for basename in os.listdir(srcdir):
    if basename.endswith('.jar'):
        pathname = os.path.join(srcdir, basename)
        if os.path.isfile(pathname):
            shutil.copy2(pathname, release_folder)

srcdir = "./OCR/target"
for basename in os.listdir(srcdir):
    if basename.endswith('.jar'):
        pathname = os.path.join(srcdir, basename)
        if os.path.isfile(pathname):
            shutil.copy2(pathname, release_folder)

srcdir = "./target/site/apidocs"
shutil.copytree(srcdir, os.path.join(release_folder, "apidocs"), False, None)
shutil.make_archive(os.path.join(release_folder, "apidocs"), 'zip', os.path.join(release_folder, "apidocs"))
