// 1. Naviguez vers le répertoire racine correct de votre projet Maven :
//    cd /chemin/vers/votre/projet/maven
//
// 2. Vérifiez l'existence et le nommage correct du fichier 'pom.xml' dans ce répertoire :
//    ls -F  (pour Unix/Linux/macOS)
//    dir    (pour Windows)
//
// 3. Si 'pom.xml' est manquant :
//    - Restaurez-le depuis votre système de contrôle de version (ex: git restore pom.xml).
//    - Pour un nouveau projet, créez un 'pom.xml' de base ou utilisez 'mvn archetype:generate'.
//
// 4. Si 'pom.xml' est mal nommé (ex: 'Pom.xml' ou 'pom.xml.bak') :
//    mv MauvaisNom.xml pom.xml