package br.com.rodrigo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrigo.exceptions.UnsupportedMathOperationException;
import br.com.rodrigo.operations.MathOperations;

@RestController
public class MathController {
		
	@GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable String numberOne, 
                      @PathVariable String numberTwo) throws Exception {
		
		if(!MathOperations.isNumeric(numberOne) || !MathOperations.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		
        return MathOperations.convertToDouble(numberOne) + MathOperations.convertToDouble(numberTwo);
    }
	
	@GetMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable String numberOne, 
                      @PathVariable String numberTwo) throws Exception {
		
		if(!MathOperations.isNumeric(numberOne) || !MathOperations.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		
        return MathOperations.convertToDouble(numberOne) - MathOperations.convertToDouble(numberTwo);
    }
	
	@GetMapping("/mul/{numberOne}/{numberTwo}")
    public Double mul(@PathVariable String numberOne, 
                      @PathVariable String numberTwo) throws Exception {
		
		if(!MathOperations.isNumeric(numberOne) || !MathOperations.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		
        return MathOperations.convertToDouble(numberOne) * MathOperations.convertToDouble(numberTwo);
    }
	
	@GetMapping("/div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable String numberOne, 
                      @PathVariable String numberTwo) throws Exception {
		
		if(!MathOperations.isNumeric(numberOne) || !MathOperations.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		
        return MathOperations.convertToDouble(numberOne) / MathOperations.convertToDouble(numberTwo);
    }
	
	@GetMapping("/sqrt/{number}")
    public Double sqrt(@PathVariable String number) throws Exception {
		
		if(!MathOperations.isNumeric(number))
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		
        return Math.sqrt(MathOperations.convertToDouble(number));
    }
	
	@GetMapping("/media/{numberOne}/{numberTwo}")
    public Double media(@PathVariable String numberOne, 
                      @PathVariable String numberTwo) throws Exception {
		
		if(!MathOperations.isNumeric(numberOne) || !MathOperations.isNumeric(numberTwo))
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		
        return (MathOperations.convertToDouble(numberOne) + MathOperations.convertToDouble(numberTwo))/2;
    }


	

}
