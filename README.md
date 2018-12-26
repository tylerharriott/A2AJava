# A2AJava
Welcome to my basic java application integration with the CA Pam A2A Client. This is a brief overview of how to setup the enviornment so that you have the ability to call and retrieve sensitive information from CA Pam. Listed below will be the steps taken inorder to get everything setup. Enjoy!

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


### Prerequisites

- Go to the [CA Pam](https://www.ca.com/us.html) website and login.

- Navigate to the download section inorder to download the A2A Client for your target system.

- Once downloaded,place folder in Local C: drive and continue to follow the on screen installation instructions to configure to your machine.

- After it has finished installing, check the C: drive to verify that the cspm directory is there.

- Then, double check to make sure the Library directoryis there. It is located in the cspm/cloakware/cspmclient/Lib.

---
### Installing

- Download the zip folder of the project from Github,and place on desktop.

- Copy the "A2AJava.java" file from the "src" directoty into your java project.

- Next, import the "Lib" directory from the cspm folderinto your project.

---
### Running and Testing

- Find and enter your alias host name into the values[] array.

```java
String [] values = { "alias_name" };
```
- Compile and Run
