package upsmart.sparta.wechat;
import io.xc5.RBC_ENGINE;

public class App{
	public void <init>(){
       RBC_ENGINE.Model_decl(RBC_ENGINE.Copy_tag(RBC_ENGINE.Get_this_pointer(), RBC_ENGINE.Get_arg(1)));
       RBC_ENGINE.Rbc_assert(
         RBC_ENGINE.Not(RBC_ENGINE.Is_tag_set(RBC_ENGINE.Get_arg(1), "tainted")),
         "FIO16-J"
       );
	}


	public void main(java.lang.String[]){
	   RBC_ENGINE.Model_decl(RBC_ENGINE.Copy_tag(RBC_ENGINE.Get_this_pointer(), RBC_ENGINE.Get_arg(1)));
       RBC_ENGINE.Rbc_assert(
         RBC_ENGINE.Not(RBC_ENGINE.Is_tag_set(RBC_ENGINE.Get_arg(1), "tainted")),
         "FIO16-J"
       );
	}
}