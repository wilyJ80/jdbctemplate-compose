# Requirements:

- Docker, Docker Compose

# Usage:

> [!TIP]
> 
> Create a .env file by renaming [example-env.md](example-env.md), then run
>
> `sudo docker compose up --build`

- No need to manually compile. Just run the container, because it compiles and runs.
   - Person endpoint: `http://localhost:8089/person`, supporting GET and POST (name parameter)
        - Database in `http://localhost:3366`

# Customizing for your project:

- Change ports in [docker-compose.yml](./docker-compose.yml) as desired.
- Change root password in `.env` as desired.
- [schema.sql](./src/main/resources/schema.sql) is the entrypoint database script. Change as desired.
    - If done, you will also want to change the example project Java source files (entities, endpoints...)

# TODO:

- [X] Return Person object instead of person name .-.
- [ ] Adminer database web UI
- [ ] Add more features and endpoints to example project
- [ ] Do not login to the database as root?
    - [ ] Add database users?
- [ ] Add view?
    - [ ] Static and templates?
- [ ] Add tests?
- [ ] Deploy?
- [ ] Remove Autowired?
- [X] try catch in the service layer?
- [X] change application.properties url?
- [ ] lists vs hashmaps

# Things I learned:

- It might be good to map your container ports to your machine ports that might be not in use. Try unconventional port numbers. Had issues with 8080 and 3306, which already were in use in my machine.

- Docker Compose is really your best option if you want a database or other extra services. Tried a single Dockerfile, sucked.

- Make sure you database script is not messed up! And remember, if there was a JDBC connection error, that probably means a database setup error, not error in your code. Check the Dockerfile, docker-compose.yml, application.properties, .env and schema.sql. Maybe your pom.xml too, just in case 🙈 ...

- Had problems with any example env file that started with .env or env. The project required a single .env in the project directory, forcing me to name the example .env as example-env.md

- It might be good to actually build your project inside the container. It isolates your project in a neat way for other people.
