# Acmicpc Kit

![KitVersion](https://img.shields.io/badge/kit_version-v1.0.0-blue.svg)
[![HitCount](http://hits.dwyl.com/silentsoft/acmicpc-kit.svg)](http://hits.dwyl.com/silentsoft/acmicpc-kit)

> Let's practice algorithms with Acmicpc Kit !

`Acmicpc Kit` is a template project for creating the `problem` project using fully customizable templates. Click [![Button](https://img.shields.io/badge/-Use_this_template-brightgreen.svg)](https://github.com/silentsoft/acmicpc-kit/generate) button to get started right now.

## Usages
  - Creating a new problem
    ```
    $ ./mvnw -N acmicpc:create -Dproblem=1234 
    ```
  - Creating a new problem with a specific template
    ```
    $ ./mvnw -N acmicpc:create -Dproblem=1234 -Dtemplate=specific
    ```
  - Revalidating project
    ```
    $ ./mvnw -N acmicpc:revalidate
    ```

## Getting started
  1. Click `Use this template` button above to create a repository.
  1. Clone the repository to your machine.
     ```
     $ git clone https://github.com/{{username}}/acmicpc-kit.git
     ```
  1. Enter the directory.
     ```
     $ cd acmicpc-kit
     ```

## Configurations

### How to define a new template
The pre-defined template is `java` template under the `templates` directory. And it is used as a **default** template.

If you want to create a new template then please follow these steps.

  1. Create a new directory with desired name under the `templates` directory.
  1. Fill in the directory with your template files.
  1. Edit `template` property in `pom.xml`.
     ```xml
     <properties>
       <template>new-template-dir-name</template>
     </properties>
     ```

## Frequently Asked Questions
- **I am not a Java developer. Can I use this program ?**
  > Of course you can. Just create a new template directory under the `templates` and edit `template` property to template directory name in `pom.xml`.

- **I'm using another site(s) instead of acmicpc.net to solve algorithm problems. Can I use this program?**
  > Of course you can. There are no restrictions on the use of this program. And you can edit the template. It's up to you.

- I just created a problem project but where is it ?
  > It is created in the `problems` directory.

- Can I delete the `pom.xml` file that exists in each problem directory ?
  > Please do not delete that file if you are a Java developer. It is designed for IDE to recognize the problem directory as a Maven module so that makes you to develop much easier. 

- It shows `Error: JAVA_HOME not found in your environment.`
  > This program requires Java. Please install it and try again.

- How can I run `mvnw` command ? It shows me one of the following error messages.

  - zsh: command not found: mvnw
  - The term 'mvnw' is not recognized as a cmdlet, function, operable program, or script file. Verify the term and try again.
  - '.' is not recognized as an internal or external command, operable program or batch file

  > (Mac or *nix) Try `./mvnw ..` instead of `mvnw ..`.  
  > (Windows) Try `mvnw ..` instead of `./mvnw ..`.

- It shows `Some problems were encountered while processing the POMs:`
  > Try `./mvnw -N acmicpc:revalidate` to revalidate the Kit.

- It seems try to compile all of problems project when I create a new one. And it makes me to wait for a long time.
  > That's why I describe `-N` flag to all of the `mvnw` commands. The `-N` flag will do what you want. Try `./mvnw -N acmicpc:create ..`.

- All of problems project seems to being skipped from maven build when I create a new one.
  > It's OK. It works really well.

- Can you provide a feature to download the problem text as a file from acmicpc.net ?
  > No. This can lead to sensitive issues related with copyright. Also, web scraping isn't allowed according to the [rules](https://www.acmicpc.net/help/rule).

- Then can you provide a migration feature for downloading my source code that I've already submitted to acmicpc.net ?
  > No. According to the [rules](https://www.acmicpc.net/help/rule), web scraping isn't allowed **for now.**

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please note we have a [CODE_OF_CONDUCT](https://github.com/silentsoft/acmicpc-kit/blob/master/CODE_OF_CONDUCT.md), please follow it in all your interactions with the project.

## License
Please refer to [LICENSE](https://github.com/silentsoft/acmicpc-kit/blob/master/LICENSE.txt).
