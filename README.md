# Information
Java 21 (JavaSE 17) <br>
Tomcat 10.1 <br>
Apache maven 3.9 <br>
# Install env
## 1. Install java
>sudo apt install openjdk-21-jdk openjdk-21-jre <br>
update-java-alternatives -l <br>
sudo update-java-alternatives -s java-1.21.0-openjdk-amd64 <br>
java -version <br>

> output: openjdk 21.0.2 2024-01-16

## 2. Install tomcat
> wget https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.19/bin/apache-tomcat-10.1.19.tar.gz

> sudo mkdir /opt/tomcat/

> sudo chmod -R 777 /opt/tomcat/

> sudo tar xzvf apache-tomcat-10.1.19.tar.gz -C /opt/tomcat --strip-components=1

> sudo chmod -R 777 /opt/tomcat/conf/

> sudo nano /etc/systemd/system/tomcat.service
> 
> Check and update this line: 
> 
>Environment="JAVA_HOME=/usr/lib/jvm/java-1.21.0-openjdk-amd64"

> sudo systemctl daemon-reload

> sudo systemctl restart tomcat

> sudo systemctl status tomcat

> #optional
> 
> sudo systemctl enable tomcat

## 3. Install maven
> wget https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.tar.gz

> tar -xvf apache-maven-3.9.6-bin.tar.gz

> sudo mv apache-maven-3.9.6 /opt/

> nano ~/.bashrc
> 
> #Add M2_HOME into this file:
> 
> M2_HOME='/opt/apache-maven-3.6.3' <br>
> PATH="$M2_HOME/bin:$PATH" <br>
> export PATH

> source ~/.bashrc
	