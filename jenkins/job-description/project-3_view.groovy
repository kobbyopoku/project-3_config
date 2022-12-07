 
listView('project-3 Jobs') {
    description('project-3 Jobs')
    jobs {
        regex('project-3_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
