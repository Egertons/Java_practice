/*
		斤噐Object階窃嶄議  toString圭隈議   膳楼
					卦指乎斤�鶺鍔峽�堪燕幣
					
					Java範葎侭嗤斤�鷆篠椡思�算葎忖憲堪嬉咫
							侭嬉咫議頁  乎斤�鶺陳擺羌慟蛍毅���念中頁窃兆    嶄寂喘@侯蝕    朔中頁乎窃議坪贋仇峽峙議込錬峙
*/
public class demo
{
	public static void main(String[] args)
	{
		jj h = new jj();
		System.out.println(h.toString());
		System.out.println(h.hashCode());   //斤噐Object階窃嶄議  hashCode()圭隈議   膳楼   卦指乎斤�鶺長�錬峙。
		System.out.println(Integer.toHexString(h.hashCode()));   //咀葎噸宥岷俊距喘圭隈補竃議込錬峙頁噴序崙議��しかしながら、壓匯違議距喘込錬峙議仇圭脅頁喘16序崙距喘議��絞遇勣廬算匯和。
		System.out.println("-------------------------------------------------------");
		
		
		Class p = h.getClass();           //getClass()  頁階窃Object嶄議匯倖圭隈 侭嗤斤�麁娜虔篇達���辛資函乎斤�鶺�class猟周。
					//壓云鞘嶄葎資函欺乎斤�鶺�class猟周朔  壅   験公匯倖Class窃侏議窃p  
 					
		System.out.println(p.getMethods());    //椎担乎窃p   潮範醤姥Class嶄議匯乂圭隈    曳泌宥狛忖准鷹猟周栖資函欺坿鷹猟周嶄議圭隈�┛�凄暴嗤圭隈��   //郡園咎議尖胎児粥��
		System.out.println(p.getName()+"@"+Integer.toHexString(h.hashCode()));    //庁亭toString()  圭隈  宥狛凪麿議圭塀糞�屐�
	}
}

class jj extends Object
{
	
}


/*
		壓Object階窃嶄侭圓枠協吶議宸乂圭隈  
				曳泌��toString()  /   equals()  /  hashCode()    /  getClass()  吉吉
				咀葎壓恷蝕兵勣癖塘侭嗤議窃����侭參協吶議扮昨凪孔嬬脅曳熟樋������短嗤焚担吭吶。
				
				壓糞縞聞喘議扮昨����匯違脅氏委万嶷亟參癖哘仟議孔嬬。
				
				PS:   壓載謹及眉圭芙曝蝕窟議窃垂嶄    載謹脅委宸乂圭隈嶷亟阻
*/