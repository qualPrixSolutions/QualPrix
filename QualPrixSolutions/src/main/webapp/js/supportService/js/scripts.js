
jQuery(document).ready(function() {
	
    /*
        Background slideshow
    */
    $('.top-content').backstretch("../images/sopportservice/backgrounds/1.jpg");
    
	/*
	    Modals
	*/
	$('.launch-modal').on('click', function(e){
		e.preventDefault();
		$( '#' + $(this).data('modal-id') ).modal();
	});
	
});
