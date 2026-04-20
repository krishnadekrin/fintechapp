FROM tomcat:9-jdk11

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/fintechapp.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

# 🔥 Sticky session support
CMD ["sh", "-c", "catalina.sh run -DjvmRoute=$JVM_ROUTE"]
