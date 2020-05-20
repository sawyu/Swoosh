package saw.com.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_legue.*

class LegueActivity : BaseActivity() {
    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_legue)
    }
    fun leagueNextClicked(view: View) {
        if(selectedLeague != ""){
            val skillActivity = Intent (this, SkillActivity :: class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }
    fun onMensClicked(view: View){
        womansLeagueBtn.isChecked =  false
        coedLeagueBtn.isChecked= false
        selectedLeague = "mens"
    }
    fun onWomansClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"
    }
    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womansLeagueBtn.isChecked = false
        selectedLeague = "co-ed"
    }

}