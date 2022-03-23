package binar.andlima.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gotodua.setOnClickListener {
            val usernm = username.text.toString()
            val pswd = password.text.toString()

            if (usernm == "waslim" && pswd == "lim123") {
                val datanya = bundleOf("USERNAME" to usernm)
                Navigation.findNavController(view).navigate(R.id.navigasike_fragmentdua, datanya)
            } else {
                ok_failed.text = "Failed"
            }

        }
    }
}