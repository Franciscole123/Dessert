🌱 . Branching Strategy
Our branching strategy follows a simplified Git Flow model:

Branch name should match the ticket name.
Branches are created from the dev branch.


🛠 To start working on your ticket:=============================================
git fetch origin
git checkout <your-ticket-name>     # e.g. ft/000_test
git pull origin dev


Keep your branch updated regularly with the dev branch
✅ If there are no conflicts, you’re ready to start coding!


✅  Committing & Pushing Your Work=====================================================================================
Once you've completed your assigned task:

git checkout <your-ticket-branch>      # Switch to your working branch

git stash                              # Save your local changes

git pull origin dev                    # Pull latest updates from dev

git stash pop                          # Reapply your stashed changes

# 👉 Solve any conflicts if they appear

git add .                              # Stage the resolved files

git commit -m "your commit message"    # Commit your changes (Use clear, descriptive commit messages.)


git push origin <your-ticket-branch>   # Push to your remote branch



Go to GitHub and create a Pull Request (PR) from your branch into dev.
Right side: your ticket branch
Left side: dev branch

Assign yourself in the Assignees section.

Choose one of the following as a Reviewer:
nainglynnaung
