# Docker base images

This repository contains the code for building base Docker images used by several build pipelines.

## TL;DR

New images can be built and uploaded to DockerHub seamlessly by just creating a Dockerfile and all the relevant contents needed into a new folder inside `images` named after the image name and the tag.

I.e. in order to build the `angular:11` image I need to have its `Dockerfile` inside the `images/angular/11` folder.

```
/
┗━━━images
    ┣━━━angular
    ┃   ┣━━━9
    ┃   ┃   ┣━━━Dockerfile
    ┃   ┗━━━11
    ┃       ┣━━━Dockerfile
    ┣━━━nginx
    ┃   ┗━━━1.20
    ┃       ┣━━━Dockerfile
    ┃       ┗━━━conf
    ┃           ┣━━━default.conf
    ┇
```
