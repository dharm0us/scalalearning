val zones = java.util.TimeZone.getAvailableIDs().grouped(20)
zones.toArray.map(_(0)).map(_.split("/")).filter(_.length == 2).map(_(1)).map(println)
