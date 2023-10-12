# Utilisez l'image de base Node.js
FROM node:lts-alpine AS build

# Définissez le répertoire de travail dans le conteneur
WORKDIR /app

# Copiez les fichiers package.json et package-lock.json dans le conteneur
COPY package*.json ./

# Installez les dépendances de l'application
RUN npm install

# Copiez le reste des fichiers de l'application dans le conteneur
COPY . .

# Générez la version optimisée de l'application
RUN npm run build --prod

# Utilisez une image légère Nginx pour servir l'application
FROM nginx:stable-alpine

# Copiez les fichiers générés de l'application vers le répertoire de contenu de Nginx
COPY --from=build /app/dist/* /usr/share/nginx/html/

# Copiez le fichier de configuration Nginx
COPY nginx/default.conf /etc/nginx/conf.d/default.conf
