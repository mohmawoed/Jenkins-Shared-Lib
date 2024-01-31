#!/usr/bin/env groovy

def call(String imageName) {
    echo "Building images."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
<<<<<<< HEAD
        sh "docker build -t  $imageName ."
=======
        sh "docker build -t  $imageName . "
>>>>>>> 27fc721e6c48da4dc21a4f47a0256bf0755fc75a
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push $imageName"
    }
}
