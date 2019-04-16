package Main;
import Model.Model;
import Model.SoruBankasiModel;

import Presenter.Presenter;
import Presenter.SinavOlusturmaPresenter;
import Presenter.SoruBankasiPresenter;
import View.SoruBankasiView;
import View.SinavOlusturmaView;
import Model.SinavOlusturmaModel;

import View.View;

import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inanb
 */
public class Main {
    
     public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            View view = new View();
            view.setPresenter(new Presenter(view, new Model()));
            view.setVisible(true);
            
            
           
            
           
        });
    }
}
