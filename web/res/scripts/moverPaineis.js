window.onscroll = scroll;  
var _taux = 0;
var _laux = 0;
function scroll()  
{  
	var left = window.pageXOffset;
	var top = window.pageYOffset;
        
	if(left==undefined)left = document.body.scrollLeft;
	if(top==undefined) top = document.body.scrollTop;
	
	if(_laux!=left)parent.jscrollTop('_f_top', left);
	if(_taux!=top)parent.jscrollLeft('_f_left', top);
	
	_taux = top;
	_laux = left;
}  
