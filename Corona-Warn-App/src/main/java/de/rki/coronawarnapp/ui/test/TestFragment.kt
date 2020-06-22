package de.rki.coronawarnapp.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.rki.coronawarnapp.databinding.FragmentTestBinding

/**
 * Basic Fragment which only displays static content.
 */
class TestFragment : Fragment() {
    companion object {
        private val TAG: String? = TestFragment::class.simpleName
    }

    private var _binding: FragmentTestBinding? = null
    private val binding: FragmentTestBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTestBinding.inflate(inflater)
        var mWebView = binding.websiteView
        mWebView.loadUrl("https://fub-hcc.github.io/20-SWP-CodingOpenness/")
        mWebView.settings.javaScriptEnabled = true
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setButtonOnClickListener()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    private fun setButtonOnClickListener() {
    }
}
