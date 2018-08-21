// Exported from:        https://localhost:5516/xlr/#/templates/Folderfb3af7086a184b42b4f5b32973b440dc-Folder3e31289c167d4239a081c44163138426-Release5c70a6b085784b3884fa7c061afcf513/releasefile
// XL Release version:   8.2.0-rc.2
// Date created:         Tue Aug 21 15:28:26 CEST 2018

xlr {
  template('hello') {
    folder('Wassap/inner folder')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-21T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('1') {
            
          }
        }
      }
    }
    
  }
}