web: java -Dserver.port=$PORT $JAVA_OPTS -jar target/*.jar
web: bundle exec rails server -p $PORT
