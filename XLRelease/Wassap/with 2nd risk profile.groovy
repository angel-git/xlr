// Exported from:        https://localhost:5516/xlr/#/templates/Folderfb3af7086a184b42b4f5b32973b440dc-Release470acd4047914efa9b632cd785f8e684/releasefile
// XL Release version:   8.2.0-rc.2
// Date created:         Tue Aug 21 14:32:33 CEST 2018

def riskProfile(title) {
    riskApi.getRiskProfileByTitle(title)
}

def riskProfile1 = riskProfile('Default risk profile (2)')

xlr {
  template('with 2nd risk profile') {
    folder('Wassap')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-21T09:00:00+0200')
    riskProfile riskProfile1
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