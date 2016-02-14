package test

class BoardUpdateCommandProcessor  {

	new(ClientGame game) {
		var player = game.players.findFirst[it.id == 343]
		player = null
	}


}
