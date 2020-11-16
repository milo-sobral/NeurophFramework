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

file.mkdir(exist_ok=True)

os.system('/bin/bash -c "mvn clean package"')
os.system('/bin/bash -c "mvn javadoc:jar"')
os.system('/bin/bash -c "mvn javadoc:aggregate"')
os.system('/bin/bash -c "mvn dependency:copy-dependencies"')

lib_path = release_folder / "lib
lib_path.mkdir()
shutil.copyfile(, release_folder / "lib")
