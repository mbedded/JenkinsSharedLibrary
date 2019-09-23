def sendBuildResult() {
  emailext recipientProviders: [developers()], 
           subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) - Build result ${currentBuild.currentResult}",
           body: "Build result: ${currentBuild.currentResult}\n"+
                 "URL: ${BUILD_URL}\n" + 
                 "Log: \${BUILD_LOG, maxLines=30, escapeHtml=false}",
           attachLog: true
}

def sendMessage(subject, message) {
  emailext recipientProviders: [developers()], 
           subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) - ${subject}",
           body: "Subject: ${subject}\n" +
           "Message: ${message}\n" +
           "URL: ${BUILD_URL}"
}