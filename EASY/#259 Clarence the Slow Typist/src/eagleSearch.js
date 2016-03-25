function EagleSearch() {

	function distance (a , b){
		/* Pythagoras
	     *   /|
	     *  / | a
	     * /__|
	     *  b
	     */
		dx = b[1] - a[1];
		dy = b[0] - a[0];

		return Math.pow(Math.pow(dx,2)+Math.pow(dy,2),0.5);

	}

	function divmod(a,b) {
		return [Math.floor(a / b), (a % b)];
	}
	function coords(character) {
	    return divmod('123456789.0'.indexOf(character), 3);
	}

EagleSearch.prototype.solve = function(seq){
		dist = 0;
		for (var i = 0; i < (seq.length-1); i++){
	    	dist += distance(coords(seq[i]),coords(seq[i+1]));
	    }
	    return dist.toFixed(2) + 'cm';
	}


}