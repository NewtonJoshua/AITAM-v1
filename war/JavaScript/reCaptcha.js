/**
 * 
 */

(function() {
	
	if (!window['___grecaptcha_cfg']) { 
		window['___grecaptcha_cfg'] = {}; 
		};
	if (!window['___grecaptcha_cfg']['render']) { 
		window['___grecaptcha_cfg']['render'] = 'onload'; 
		};
	window['__google_recaptcha_client'] = true;
	var po = document.createElement('script');
	po.type = 'text/javascript'; 
	po.async = true;
	po.src = 'reCaptcha__en.js';
	var s = document.getElementsByTagName('script')[0]; 
	s.parentNode.insertBefore(po, s);
	}
)();
