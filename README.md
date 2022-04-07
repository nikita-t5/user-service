1) docker run --name my-pg-container -p 5432:5432 -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=db -d postgres:13.3
2) mvn clean package  
3) java -jar target/user-service-1.0.0-SNAPSHOT.jar
