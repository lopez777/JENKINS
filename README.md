# Jenkins
Using Jenkins for the continuous integration of an asteroid game.

Step 1: Launched an EC2 instance to host our Jenkins server

Step 2: Installed Jenkins on the instance. This allowed us to access the Jenkins server on the Google Chrome web browser using the public IP of the EC2 instance followed by the port 8080

Step 3: Next, we installed the Maven plugin in Jenkins which allowed us to create a Maven project within Jenkins. (This is essential because we needed to transfer our local Maven project which conatins all the source code and JUnit test cases onto the Jenkins server)

Step 4: Installed Git on our EC2 instance so that we were able to track changes made to our public GitHub repository

Step 5: The URL for the public repository along with the project URL then needed to be added to the configuration of the Maven project that we created

Step 6: Finally, we install the email notifcation plugin in Jenkins in order to have a feedback mechanism to allow us to send emails to all subscribers upon any changes
