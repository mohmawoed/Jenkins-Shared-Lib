#!/usr/bin/env groovy

def call() {
<<<<<<< HEAD
    echo "building the application for branch $BRANCH_NAME "
=======
    echo "building the application from branch $BRANCH_NAME"
>>>>>>> 27fc721e6c48da4dc21a4f47a0256bf0755fc75a
    sh 'mvn package'
}
