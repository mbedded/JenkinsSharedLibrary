# JenkinsSharedLibrary

This is a SharedLibrary for Jenkins.
Shared Libraries are able to add additional features
to Jenkins build steps.


## Additional Links

- [Jenkins](https://jenkins.io/)
- [Extending with Shared Libraries (Jenkins manual)](https://jenkins.io/doc/book/pipeline/shared-libraries/)


## How to install and use

- Open your Jenkins Website and log in
- Left menu > `Configure Jenkins`
- `Configure system`
- Scroll down to `Global Pipeline Libraries`
- Add the library
  - Give it a name you like (example: `my-library`)
  - Set the project repository (git URL)
  - Save your changes
- In your Pipeline Script use `@Library('my-library') _` and call the methods
