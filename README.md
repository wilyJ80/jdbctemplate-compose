- Requirements:

    - Docker, Docker Compose

- Usage:

    - > [!TIP]
    > 
    > Create a .env file with the information in [example-env.md](example-env.md), then run
    >
    > `sudo docker compose up`

    - No need to manually compile. Just run the container, because it compiles and runs.
    - You might need to remove the image in case you need to change something. .-.
   - Person endpoint: `http://localhost:8089/person`, supporting GET and POST (name parameter)
        - Database in `http://localhost:3366`

- Customizing for your project:

    - Change ports in [docker-compose.yml](./docker-compose.yml) as desired.
    - Change root password in `.env` as desired.
    - [schema.sql](./src/main/resources/schema.sql) is the entrypoint database script. Change as desired.
        - If done, you will also want to change the example project Java source files (entities, endpoints...)

- TODO:
    - [ ] Return Person object instead of person name .-.
    - [ ] Adminer database web UI
    - [ ] Do not compile in the container. The problem where "you might need to remove the image in case you need to change something" is dumb and not worth the "convenience" of not needing to compile locally.
    - [ ] Add more features and endpoints to example project
    - [ ] Do not login to the database as root?
        - [ ] Add database users?
    - [ ] Add view?
        - [ ] Static and templates?
    - [ ] Add tests?
