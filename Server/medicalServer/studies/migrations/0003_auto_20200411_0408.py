# Generated by Django 3.0.5 on 2020-04-11 04:08

from django.db import migrations, models
import django.utils.timezone


class Migration(migrations.Migration):

    dependencies = [
        ('studies', '0002_auto_20200411_0354'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='studyaccess',
            name='dateAccessed',
        ),
        migrations.AddField(
            model_name='studyaccess',
            name='time',
            field=models.DateTimeField(default=django.utils.timezone.now),
            preserve_default=False,
        ),
    ]