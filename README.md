# 📸 Photos Spring Boot App

A Spring Boot application that demonstrates uploading photos and downloading using an H2 database. 

## ⚙️ Tech Stack

- `Java`
- `Spring Boot`
- `Spring Web`
- `H2 database`

## ✨ Features

- Retrieve data from the H2 database via REST APIs
- Upload photos using HTML form and a POST endpoint
- Download photos via a GET endpoint

## 🔌 API Endpoints

| Method | Endpoint        | Description                 |
|-------:|-----------------|-----------------------------|
| GET    | /photos         | Retrieve all photos         |
| GET    | /photos/{id}    | Retrieve a specific photo   |
| GET    | /download/{id}  | Download a specific photo   |
| POST   | /photos         | Add a photo                 |
| DELETE | /photos/{id}    | Delete a specific photo     |

 
## 📍 Motivation

This was an exercise to get myself familiar with Spring. 

## ▶️ Running the Project

1. Navigate to the `photos-clone` folder
```bash
cd photos-clone
```
2. Run the Spring Boot Application
```bash
./mvnw spring-boot:run
```
3. The backend server will run on `http://localhost:8080`
4. Go to `http://localhost:8080/upload.html` for uploading photos

## 📚 References
- Built following [Marco Codes’ Spring Boot tutorial](https://www.youtube.com/watch?v=QuvS_VLbGko)
