package com.spring.springangular.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

	public List<String> getNumber() {
		String color;
		List<String> numeroSomadoColor = new ArrayList<>();
		Double numeroInteiro = Math.floor(Math.random() * 361);
		
		Double numeroSomado = numeroInteiro + 360.0;
		int posicaoPonto = numeroSomado.toString().indexOf(".");
		String numeroString = numeroSomado.toString();
		numeroSomadoColor.add(numeroString.substring(0,posicaoPonto));
		if (numeroSomado >= 365 && numeroSomado <= 374 || numeroSomado >= 384 && numeroSomado <= 393 || numeroSomado >= 403 && numeroSomado <= 412 || numeroSomado >= 422 && numeroSomado <= 430 || 
				numeroSomado >= 441 && numeroSomado <= 449 || numeroSomado >= 460 && numeroSomado <= 468 || numeroSomado >= 478 && numeroSomado <= 487 || numeroSomado >= 497 && numeroSomado <= 506 || 
				numeroSomado >= 516 && numeroSomado <= 525 || numeroSomado >= 554 && numeroSomado <= 563 || numeroSomado >= 573 && numeroSomado <= 582 || numeroSomado >= 592 && numeroSomado <= 601 || 
				numeroSomado >= 611 && numeroSomado <= 620 || numeroSomado >= 630 && numeroSomado <= 639 || numeroSomado >= 649 && numeroSomado <= 658 || numeroSomado >= 668 && numeroSomado <= 677 || 
				numeroSomado >= 687 && numeroSomado <= 696 || numeroSomado >= 706 && numeroSomado <= 715) 
		{
			color = "black";
			numeroSomadoColor.add(color);
		}
		if (numeroSomado >= 375 && numeroSomado <= 383 || numeroSomado >= 394 && numeroSomado <= 402 || numeroSomado >= 413 && numeroSomado <= 421 || numeroSomado >= 431 && numeroSomado <= 440 || 
				numeroSomado >= 450 && numeroSomado <= 459 || numeroSomado >= 469 && numeroSomado <= 477 || numeroSomado >= 488 && numeroSomado <= 496 || numeroSomado >= 507 && numeroSomado <= 515 || 
				numeroSomado >= 526 && numeroSomado <= 534 || numeroSomado >= 545 && numeroSomado <= 553 || numeroSomado >= 564 && numeroSomado <= 572 || numeroSomado >= 583 && numeroSomado <= 591 || 
				numeroSomado >= 602 && numeroSomado <= 610 || numeroSomado >= 621 && numeroSomado <= 629 || numeroSomado >= 640 && numeroSomado <= 648 || numeroSomado >= 659 && numeroSomado <= 667 || 
				numeroSomado >= 678 && numeroSomado <= 686 || numeroSomado >= 697 && numeroSomado <= 705) 
		{
			color = "red";
			numeroSomadoColor.add(color);
		}
		if (numeroSomado >= 535 && numeroSomado <= 544 || numeroSomado >= 716 || numeroSomado <= 364) {
		      color = "green";
		      numeroSomadoColor.add(color);
		}
		
		
		return numeroSomadoColor;
	}

	
}
