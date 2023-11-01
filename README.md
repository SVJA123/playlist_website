# Playlist App

## Description

The Playlist App is an interactive web application that allows users to manage their music playlists. With this app, users can organize their music by creating multiple playlists, each with its own description and list of songs. The app provides functionality to view, add, edit, and delete playlists as well as individual music tracks within them.

## Features

- **Playlist Management**: Users can view their list of playlists, add new playlists, edit existing ones, and delete them.
- **Music Details**: Each music track within a playlist displays its name, artist, album, genre, release year, and a Spotify link.
- **Search Functionality**: Users can search for music tracks or playlists by titles. The search comes with three options: search music, search playlists, and search all.

## Technologies Used
- Java
- Maven
- Servlets
- JSP
- Bootstrap

## Getting Started

To run this web application on your local machine, follow the instructions below.

### Prerequisites

- Java JDK (version 8 or higher recommended)
- Maven (to build and run the project)

### Installation

1. Clone this repository onto your device
2. Open a terminal or command prompt and navigate to the project directory.
3. Use Maven to build and run the project with the following commands:

   ```shell
   mvn compile
   mvn test
   mvn package
   mvn exec:exec

### Running the App

After building the project, access the web interface by visiting http://localhost:8080/ in your web browser. Feel free to explore, modify, or remove the pre-loaded dummy data as you dive into the features.