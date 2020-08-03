# Commennt exécuter l'application

Dans Android studio, après avoir ouvert votre application, cliquez sur "*Run*" dans la barre d'outils afin d'ouvrir le menu déroulant. 
Ensuite, choisissez l'option "*Run 'app'*" qui va ouvrir sur la fenêtre "*Select Deployement Target*" pour choisir soit un appareil Android connecté en usb ou un émulateur android.
Si vous n'avez pas d'émulateur android déjà créé appuyer sur "*Create New Virtual Device*" pour ouvrir le menu "*AVD manager*" et ensuite il suffit de suivre les étapes indiquées pour créer un emulateur android. Sinon vous avez la possibilité de brancher un appareil Android pour lancer votre application, mais cet appareil doit avoir activé le mode développeur. 

# Comment compiler l'application 

Pour compiler l'application sur Android Studio, il faut cliquer sur "*Build*" dans la barre d'outils et ensuite choisir "*Make Project*" dans le menu déroulant qui s'est ouvert. 
Cela va permettre de compiler l'application en fonction des éléments inscrits dans le gradle.
Dans le gradle, spécifiquement le fichier "*build.gradle (Module: app)*", on retrouve les informations comme la version android minimum visée par l'application ou encore l'ensemble des bibliothèques nécessaires a fonctionnement de l'application (exemple la bibliothèque recyclerview ou coordinatorlayout, ou encore junit et espresso pour effectuer les tests). 

