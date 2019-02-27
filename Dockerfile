FROM java:8-jdk-alpine
VOLUME /tmp
ADD trade-service-controller/target/guessing-controller-0.0.1-SNAPSHOT.jar guessing.jar
RUN sh -c 'touch /guessing.jar'
#ENV JAVA_OPTS="-server -Xmx1400m -Xms1400m -Xss256K -Xmn400M -XX:SurvivorRatio=4 -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:-CMSParallelRemarkEnabled -XX:CMSInitiatingOccupancyFraction=75 -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintHeapAtGC -XX:+PrintGCApplicationStoppedTime -XX:+PrintGCApplicationConcurrentTime -XX:+PrintClassHistogram -XX:+PrintTLAB -XX:+PrintTenuringDistribution -Xloggc:/code/hezhu/log/trade/gc.log -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/code/hezhu/log/trade/heapdump.bin"
#ENV PROFILES=dev
ENV TZ=Asia/Shanghai
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/guessing.jar"]