package br.com.alura.flixprime;

import br.com.alura.flixprime.model.DadosSerie;
import br.com.alura.flixprime.service.ConsumoApi;
import br.com.alura.flixprime.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlixprimeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FlixprimeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=e43ab29b");
//		System.out.println(json);
//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(json);
		ConverterDados conversor= new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
