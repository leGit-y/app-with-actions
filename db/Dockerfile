FROM mysql

ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=app
ENV MYSQL_USER=app
ENV MYSQL_PASSWORD=app12345

# 이부분이 db초기 세팅하는 부분!
COPY ./app.sql /docker-entrypoint-initdb.d/
