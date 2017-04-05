package br.com.q4auditoria.web.mb.acaofuncionalidade;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

import br.com.q4auditoria.web.models.AcaoEntity;
import br.com.q4auditoria.web.models.AcaoFuncionalidadeEntity;
import br.com.q4auditoria.web.models.FuncionalidadeEntity;
import br.com.q4auditoria.web.services.interfaces.IAcaoFuncionalidadeService;
import br.com.q4auditoria.web.services.interfaces.IAcaoService;
import br.com.q4auditoria.web.services.interfaces.IFuncionalidadeService;
import br.com.q4auditoria.web.utils.BaseEntity;

@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "acaoFuncionalidadeMB")
public class AcaoFuncionalidadeMB extends BaseEntity {

	private static final long serialVersionUID = -684399356651642281L;

	private static final Logger logger = Logger.getLogger(AcaoFuncionalidadeMB.class);
	
	@Inject
	private IAcaoFuncionalidadeService acaoFuncionalidadeService;
	
	@Inject
	private IAcaoService acaoService;
	
	@Inject
	private IFuncionalidadeService funcionalidadeService;
	
	private List<AcaoFuncionalidadeEntity> listaAcaoFuncionalidade;
	
	private List<AcaoEntity> listaAcao;
	
	private List<FuncionalidadeEntity> listaFuncionaldiade;
	
	private AcaoFuncionalidadeEntity selectedAcaoFuncionalidade;
	
	public AcaoFuncionalidadeMB(){
	}
	
	public void delete(){
		if (selectedAcaoFuncionalidade != null){
			this.acaoFuncionalidadeService.delete(selectedAcaoFuncionalidade);
		}
	}
	
	public void onLoad(){
		this.listaAcaoFuncionalidade = this.acaoFuncionalidadeService.findAll();
	}
	
	public List<AcaoFuncionalidadeEntity> getListaAcaoFuncionalidade(){
		return this.listaAcaoFuncionalidade;
	}
	
	public List<AcaoEntity> getListaAcao(){
		if (listaAcao != null){
			this.listaAcao = this.acaoService.findAll();
		}		
		return this.listaAcao;
	}
	
	public List<FuncionalidadeEntity> getListaFuncionalidade(){
		if(listaFuncionaldiade != null){
			this.listaFuncionaldiade = this.funcionalidadeService.findAll();
		}		
		return this.listaFuncionaldiade;
	}
	
	public void selectAcaoFuncionalidade(SelectEvent evt){
		try{
			if (evt.getObject() != null){
				this.selectedAcaoFuncionalidade = (AcaoFuncionalidadeEntity) evt.getObject();
			}else{
				this.selectedAcaoFuncionalidade = null;
			}
		}catch (Exception e) {
			this.selectedAcaoFuncionalidade = null;			
			logger.error(e.getMessage(), e);
		}
	}
	
	public void unSelect(){
		this.selectedAcaoFuncionalidade = null;
	}

	public AcaoFuncionalidadeEntity getSelectedAcaoFuncionalidade() {
		return selectedAcaoFuncionalidade;
	}

	public void setSelectedAcaoFuncionalidade(AcaoFuncionalidadeEntity selectedAcaoFuncionalidade) {
		this.selectedAcaoFuncionalidade = selectedAcaoFuncionalidade;
	}
	
}
