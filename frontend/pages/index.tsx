import Card from '@mui/material/Card';
import type { NextPage } from 'next'
import Head from 'next/head'

import {Grid, Button } from '@mui/material';
import { CheckBox } from '@mui/icons-material';

const Home: NextPage = () => {


  return (
    <div>
      <div>
        <Head>

          <img src="https://apksos.com/storage/images/com/puntook/com.puntook_1.png" alt="logo" sizes={2} />
          <text>Home</text>
          <a>Tarefas</a>
          <a>Sobre</a>
        </Head>
      </div>

      <h1 >
        Tarefas
      </h1>

      <div>

      </div>

      <Card variant="outlined" >
        <select name="tarefas" id="tarefas" />

        <input type="date" className="form-control" placeholder="Periodo inicial" />
        <input type="date" className="form-control" placeholder="Pediodo final" />
        <textarea className="form-control" placeholder="Digite a sua descrição>"></textarea>

      </Card>
      <footer />

      <Grid container rowSpacing={1} columnSpacing={{ xs: 1, sm: 2, md: 3 }}>
        <Grid item xs={6}>
          <Button variant="contained" color="success">
            Success
          </Button>

          <CheckBox />

        </Grid>
        <Grid item xs={6}>

        </Grid>
      </Grid>

    </div>

  )
}

export default Home
