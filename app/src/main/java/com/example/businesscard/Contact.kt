import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Contact (modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(top = 200.dp, bottom = 50.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(5.dp)
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(text = "+62 813 4042 5012",
                modifier = Modifier.padding(start = 14.dp))
        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(5.dp)
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(text = "@salsabmw_",
                modifier = Modifier.padding(start = 14.dp))
        }
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(5.dp)
        ){
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color(0xFF006833)
            )
            Text(text = "misnawati240804@gmail.com",
                modifier = Modifier.padding(start = 14.dp))
        }
    }
}