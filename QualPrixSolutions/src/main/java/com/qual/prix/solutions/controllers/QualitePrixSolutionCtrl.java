package com.qual.prix.solutions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qual.prix.solutions.services.QualPrixSolutionsService;
import com.qual.prix.solutions.webstock.domaine.ContactMessage;
import com.qual.prix.solutions.webstock.domaine.InformationsUtilisateur;

 
@Controller
public class QualitePrixSolutionCtrl {
	
	@Autowired
	private MailSender mailMessage;
	
	@Autowired
	private QualPrixSolutionsService qualPrixSolService;
	
	
 

	@RequestMapping(value="/shopping", method = RequestMethod.GET)
	public ModelAndView getShopping() {
		ModelAndView model = new ModelAndView();
		model.setViewName("shopping");
		return model;
	}
	
	
	@RequestMapping(value="/locations", method = RequestMethod.GET)
	public ModelAndView getLocations() {
		ModelAndView model = new ModelAndView();
		model.setViewName("locations");
		return model;
	}
	
	@RequestMapping(value="/contacts", method = RequestMethod.GET)
	public ModelAndView getContacts() {
		ModelAndView model = new ModelAndView();
		model.setViewName("contacts");
		return model;
	}
	
	
	@RequestMapping(value="/sponsors", method = RequestMethod.GET)
	public ModelAndView getSponsors() {
		ModelAndView model = new ModelAndView();
		model.setViewName("sponsors");
		return model;
	}
	
	@RequestMapping(value="/supportService", method = RequestMethod.GET)
	public ModelAndView getSupportService() {
		ModelAndView model = new ModelAndView();
		model.setViewName("supportService");
		return model;
	}
	
	@RequestMapping(value="/tutorialAstuce", method = RequestMethod.GET)
	public ModelAndView getTutorialAstuce() {
		ModelAndView model = new ModelAndView();
		model.setViewName("tutorialAstuce");
		return model;
	}
	
	@RequestMapping(value="/changePage", method = RequestMethod.GET)
	public ModelAndView getChangePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("changePage");
		return model;
	}
	
	@RequestMapping(value="/newuser", method = RequestMethod.GET)
	public ModelAndView getRegistrationNouveauUtilisateur() {
		ModelAndView model = new ModelAndView();
		model.setViewName("newuser");
		return model;
	}
	
	@RequestMapping(value="/loginPage", method = RequestMethod.GET)
	public ModelAndView getLoginPage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("loginPage");
		return model;
	}
	
	
	@RequestMapping(value="/sendMessage", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public void getSendMail(@RequestBody ContactMessage contactMessage) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("nguematsia@gmail.com");
		message.setTo("nguematsia@yahoo.com");
		message.setSubject("qualité prix solution");
		message.setText("je suis albert merli nguematsia");
		mailMessage.send(message);
	}
	
	
	@RequestMapping(value="/insertInfoPersonne", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView getPersonneInfo(@RequestBody InformationsUtilisateur infoPersonne) {
		qualPrixSolService.creerNouveauUtilisateur(infoPersonne);
		return new ModelAndView("loginPage");
	}


	public MailSender getMailMessage() {
		return mailMessage;
	}


	public void setMailMessage(MailSender mailMessage) {
		this.mailMessage = mailMessage;
	}

	

	public QualPrixSolutionsService getQualPrixSolService() {
		return qualPrixSolService;
	}


	public void setQualPrixSolService(QualPrixSolutionsService qualPrixSolService) {
		this.qualPrixSolService = qualPrixSolService;
	}

 
}
