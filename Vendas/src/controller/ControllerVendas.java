package controller;

import model.ModelVendas;
import DAO.DAOVendas;
import java.util.ArrayList;
import relatorios.DAORelatorios;

/**
 * @author  Rafael
 */
public class ControllerVendas {

    private DAOVendas daoVendas = new DAOVendas();
    private DAORelatorios dAORelatorios = new DAORelatorios();

    /**
    * grava Vendas
    * @param pModelVendas
    * return int
    */
    public int salvarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pCodigo
    * return ModelVendas
    */
    public ModelVendas getVendasController(int pCodigo){
        return this.daoVendas.getVendasDAO(pCodigo);
    }

    /**
    * recupera uma lista deVendas
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasController(){
        return this.daoVendas.getListaVendasDAO();
    }

    /* recupera uma lista deVendas
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasController(int pCodigo){
        return this.daoVendas.getListaVendasDAO(pCodigo);
    }
    
    /**
    * atualiza Vendas
    * @param pModelVendas
    * return boolean
    */
    public boolean atualizarVendasController(ModelVendas pModelVendas){
        return this.daoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pCodigo
    * return boolean
    */
    public boolean excluirVendasController(int pCodigo){
        return this.daoVendas.excluirVendasDAO(pCodigo);
    }

    public boolean salvarVendasProdutosController(ModelVendas modelVendas) {
        return this.daoVendas.salvarProdutosVendasDAO(modelVendas);
    }

    public boolean gerarRelatorioVenda(int pCodigo) {
        return this.dAORelatorios.gerarRelatorioVenda(pCodigo);
    }
}