// Exported from:        http://Angels-MacBook-Pro.local:5516/#/templates/Release2d1314bf5183497ca334d28bf69e7562/releasefile
// XL Release version:   8.1.0-rc.3
// Date created:         Thu Jun 14 14:43:33 CEST 2018

xlr {
  template('1234') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-06-14T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          manual('1') {
            
          }
        }
      }
    }
    teams {
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_security', 'template#create_release'
      }
      team('Release Admin') {
        permissions 'release#edit', 'release#lock_task', 'release#start', 'release#reassign_task', 'release#edit_blackout', 'template#view', 'release#edit_security', 'release#abort', 'release#view', 'release#edit_task'
      }
    }
  }
}