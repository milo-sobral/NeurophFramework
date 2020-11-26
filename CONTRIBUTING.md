# How to contribute

>First off, thank you for considering contributing to Neuroph Framework!

To contribute a new feature, bug, or any patch follow the following steps:

1. `git checkout main && git pull` to make sure you are on the latest commit on master
2. Branch out to a different branch named using your username and the new feature name `git checkout -b [username]/[feature name]`.
3. When done working on the patch, build and run the tests locally to make sure that the patch will fail the CI.
4. Then push your branch to Github by doing `git push origin [branch name]`
5. Create a new PR to main and make sure to assign yourself to the PR then ask for at least one reviewer to look at the code. Also, make sure to set the appropriate label, project, and milestone.
6. Follow the pull request template laid out, and fill in corresponding information.
7. If changes are requested, do the required changes locally then do `git push origin [branch name]` which will update the PR automatically and mark the resolved comments are resolved. Continue doing so until you get at least one approval.
8. Merge the PR 

**Important Note**: As master is not protected, please don't push to it directly!
