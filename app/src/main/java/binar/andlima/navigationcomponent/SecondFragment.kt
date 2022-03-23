package binar.andlima.navigationcomponent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            val datausername = arguments?.getString("USERNAME")
            untuk_username.text = "Hello, $datausername"

            gototiga.setOnClickListener {
                val tahunskrg = umur_skrg.text.toString().toInt()
                val tahunlhir = umur_lhr.text.toString().toInt()

                val umurnya = tahunskrg - tahunlhir

                val ganap = if (umurnya % 2  == 0){
                    "Genap"
                } else {
                    "Ganjil"
                }

                val datanya2 = bundleOf( "UMUR" to umurnya.toString(), "USERNAME" to datausername, "GANAP" to ganap)

                Navigation.findNavController(view).navigate(R.id.navigasike_fragmenttiga, datanya2)
            }

        }
}
