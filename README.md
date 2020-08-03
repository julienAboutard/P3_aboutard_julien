# Commennt exécuter l'application

Dans Android studio, après avoir ouvert votre application, cliquez sur "Run" dans la barre d'outils afin d'ouvrir le menu déroulant. 
Ensuite, choisissez l'option "Run 'app'" qui va ouvrir sur la fenêtre "Select Deployement Target" pour choisir soit un appareil Android connecté en usb ou un émulateur android.
Si vous n'avez pas d'émulateur android déjà créé appuyer sur "Create New Virtual Device" pour ouvrir le menu "AVD manager" et ensuite il suffit de suivre les étapes indiquées pour créer un emulateur android. Sinon vous avez la possibilité de brancher un appareil Android pour lancer votre application, mais cet appareil doit avoir activé le mode développeur. 

# Comment compiler l'application 

Pour compiler l'application sur Android Studio, il faut d'abord changer le Build Variant de votre application. 
Pour cela, cliquez sur "Build" afin de dérouler le menu et sélectionnez l'option "Select Build Variant". (Si cette option est grisé, il suffit de sélectionner le dossier app dans la fenêtre "project" et de refaire la cette manipulation)
Pour le besoin de développement de l'application, le build variant est sur mode debugg il faut le changer sur release en cliquant dessus et choisissant "release" dans le menu déroulant qui s'est ouvert.
Ensuite, en ouvrant à nouveau le menu déroulant de "Build" on a le choix entre plusieurs possibilités pour compiler le projet :
- "Make project"
- "Clean project"
- "Rebuild project"
- "Build Bundle/Apk"
- "Generate Signed Bundle/Apk"
Pour notre situation, on choisira l'option "Rebuild project".
