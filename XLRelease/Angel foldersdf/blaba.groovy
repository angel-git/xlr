// Exported from:        https://localhost:5516/xlr/#/templates/Folder479287c16ad8427fbfe67d12cca929e9-Releaseb079c0234c5e4a80a33a9dc3a8f5bf16/releasefile
// XL Release version:   8.2.0-rc.2
// Date created:         Wed Aug 22 15:12:41 CEST 2018

xlr {
  template('blaba') {
    folder('Angel foldersdf')
    variables {
      stringVariable('123') {
        
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-22T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          custom('1') {
            script {
              type 'webhook.XmlWebhook'
              
            }
          }
          manual('2') {
            
          }
        }
      }
    }
    
  }
}