
 web: java $JAVA_OPTS -Dserver.port=$PORT -jar target/*.war
web: bundle exec rails server -p $PORT
