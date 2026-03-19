// 1. Vérifiez le répertoire courant :
pwd

// 2. Vérifiez si le fichier pom.xml existe dans ce répertoire :
ls -l pom.xml

// Si 'pom.xml' n'est pas listé ou si 'pwd' indique que vous n'êtes pas dans le bon répertoire :

// Option A: Naviguez vers le répertoire racine de votre projet Maven (là où le pom.xml se trouve normalement) :
// cd /chemin/vers/votre/projet/maven

// Option B: Si le fichier pom.xml est manquant ou mal nommé (par exemple, pom.xml.bak) :
//    B.1: Renommez-le si vous savez qu'il existe sous un autre nom :
//    mv nom_incorrect.xml pom.xml

//    B.2: Si c'est un nouveau projet et que le pom.xml n'a jamais été créé, vous pouvez en générer un de base (à adapter) :
//    mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DinteractiveMode=false

//    B.3: Si c'est un projet existant et que le pom.xml a disparu, restaurez-le depuis votre système de contrôle de version (Git, SVN, etc.).

// Une fois que vous êtes dans le bon répertoire et que le 'pom.xml' est présent et correctement nommé, réessayez votre commande de build.