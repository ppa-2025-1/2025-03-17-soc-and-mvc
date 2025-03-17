package br.edu.ifrs.riogrande.tads.ppa.cobaia.view.helper;

import org.springframework.stereotype.Component;

@Component
public class HorarioViewHelper {
    
    public String format(int horas) {
        return "🕜 " + horas + "h";
    }
}
