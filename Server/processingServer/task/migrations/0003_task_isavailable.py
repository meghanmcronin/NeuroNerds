# Generated by Django 3.0.5 on 2020-04-14 00:47

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('task', '0002_auto_20200413_2333'),
    ]

    operations = [
        migrations.AddField(
            model_name='task',
            name='isAvailable',
            field=models.BooleanField(default=False),
        ),
    ]